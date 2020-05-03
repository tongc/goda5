package com.goda5.hagendaz.data.dao;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.*;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.apache.kafka.streams.state.Stores;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.function.Consumer;

/**
 * .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic tongtable  --group ee
 * .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic tongtable --group a
 * .\kafka-console-producer.bat --broker-list localhost:9092 --topic tongt1 --property "parse.key=true" --property "key.separator=:"
 */
public class KafkaDaoConsumer {
    public static void main(String[] args) throws InterruptedException {
        final KafkaConsumer consumer = new KafkaConsumer<String, Long>(getStreamsConfiguration("localhost:9092"));
        consumer.subscribe(Collections.singletonList("long-counts-all-str-250-3" + "tc"));

        while (true) {
            final ConsumerRecords<Windowed, Long> consumerRecords = consumer.poll(Duration.ofMillis(100));

            consumerRecords.forEach(record -> {
                System.out.println(new Date(record.key().window().start()) + " : " + new Date(record.key().window().end()));
                System.out.println(new Date(record.timestamp()) + " " + record.value() + " " + record.offset() + " " + record.key().key());
//                System.out.printf("Consumer Record:(%d, %s, %d, %d)\n",
//                        record.key(), record.value(),
//                        record.partition(), record.offset());
            });

            consumer.commitAsync();
        }
    }

    static Properties getStreamsConfiguration(final String bootstrapServers) {
        final Properties streamsConfiguration = new Properties();
        // Give the Streams application a unique name.  The name must be unique in the Kafka cluster
        // against which the application is run.
        streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, "tongappid");
        streamsConfiguration.put(StreamsConfig.CLIENT_ID_CONFIG, "tongclientid");
        streamsConfiguration.put("group.id", "tonggroupid");

        // Where to find Kafka broker(s).

        streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        // Specify default (de)serializers for record keys and for record values.
        streamsConfiguration.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, TimeWindowedDeserializer.class.getName());
        streamsConfiguration.put(StreamsConfig.DEFAULT_WINDOWED_KEY_SERDE_INNER_CLASS, Serdes.StringSerde.class.getName());
        streamsConfiguration.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, LongDeserializer.class.getName());

        // Records should be flushed every 10 seconds. This is less than the default
        // in order to keep this example interactive.
        streamsConfiguration.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 10 * 1000);
        // For illustrative purposes we disable record caches.
        streamsConfiguration.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, 0);
        // Use a temporary directory for storing state, which will be automatically removed after the test.
        streamsConfiguration.put(StreamsConfig.STATE_DIR_CONFIG, "c:/tmp/");
        return streamsConfiguration;
    }
}
