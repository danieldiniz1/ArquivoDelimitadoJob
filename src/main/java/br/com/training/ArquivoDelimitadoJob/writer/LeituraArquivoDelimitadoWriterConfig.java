package br.com.training.ArquivoDelimitadoJob.writer;

import br.com.training.ArquivoDelimitadoJob.model.Cliente;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeituraArquivoDelimitadoWriterConfig {

    private static final Logger LOGGER = LogManager.getLogger();

    @Bean
    public ItemWriter<Cliente> leituraArquivoDelimitadoWriter(){
        return items -> items.forEach(cliente -> LOGGER.info(cliente.toString()));
    }
}
