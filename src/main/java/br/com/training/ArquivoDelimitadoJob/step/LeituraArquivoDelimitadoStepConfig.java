package br.com.training.ArquivoDelimitadoJob.step;

import br.com.training.ArquivoDelimitadoJob.model.Cliente;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class LeituraArquivoDelimitadoStepConfig {

    @Bean
    public Step leituraArquivoDelimitadoStep(ItemReader<Cliente> leituraArquivoDelimitadoReader,
                                             ItemWriter<Cliente> leituraArquivoDelimitadoWriter,
                                             JobRepository jobRepository,
                                             PlatformTransactionManager transactionManager) {
        return new StepBuilder("leituraArquivoDelimitadoStep",jobRepository)
                .<Cliente,Cliente> chunk(1)
                .reader(leituraArquivoDelimitadoReader)
                .writer(leituraArquivoDelimitadoWriter)
                .transactionManager(transactionManager)
                .build();
    }
}
