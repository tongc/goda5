package com.goda5.hagendaz.data.dao;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StoreQueryParameters;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.apache.kafka.streams.state.Stores;
import sun.security.krb5.internal.tools.Ktab;

import java.util.Arrays;
import java.util.Properties;
import java.util.function.Consumer;

/**
 * .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic tongtable  --group ee
 * .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic tongtable --group a
 * .\kafka-console-producer.bat --broker-list localhost:9092 --topic tongt1 --property "parse.key=true" --property "key.separator=:"
 */
public class KafkaDao {
    public static void main(String[] args) throws InterruptedException {
        final StreamsBuilder builder = new StreamsBuilder();

        final Serde<String> stringSerde = Serdes.String();
        final Serde<Long> longSerde = Serdes.Long();

        KStream<String, String> textLines = builder.stream("tongt1", Consumed.with(stringSerde, stringSerde));
        textLines.foreach(new ForeachAction<String, String>() {
            @Override
            public void apply(String s, String s2) {
                System.out.println(s + ":" + s2);
            }
        });
        KTable<String, Long> wordCounts = textLines
                .flatMapValues(value -> Arrays.asList(value.toLowerCase().split(" ")))
                .groupBy((key, value) -> value)
                .count();

        KTable<String, String> latestVal = textLines.toTable();

        wordCounts.toStream().to("tongt2", Produced.with(stringSerde, longSerde));
        latestVal.toStream().to("tongtable", Produced.with(stringSerde, stringSerde));


        KeyValueBytesStoreSupplier storeSupplier = Stores.inMemoryKeyValueStore("mystore");
        KTable<String, String> table = builder.table(
                "tongtable",
                Materialized.<String, String>as(storeSupplier)
                        .withKeySerde(Serdes.String())
                        .withValueSerde(Serdes.String())
        );


        final String bootstrapServers = args.length > 0 ? args[0] : "localhost:9092";
        final Properties streamsConfiguration = getStreamsConfiguration(bootstrapServers);
        final KafkaStreams streams = new KafkaStreams(builder.build(), streamsConfiguration);
        streams.start();


        Thread.sleep(10000);
        ReadOnlyKeyValueStore view = streams.store(StoreQueryParameters.fromNameAndType("mystore", QueryableStoreTypes.keyValueStore()));
        System.out.println(view.get("cc"));
        view.all().forEachRemaining(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("value: " + o);
            }
        });
    }

    static Properties getStreamsConfiguration(final String bootstrapServers) {
        final Properties streamsConfiguration = new Properties();
        // Give the Streams application a unique name.  The name must be unique in the Kafka cluster
        // against which the application is run.
        streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, "tongappid");
        streamsConfiguration.put(StreamsConfig.CLIENT_ID_CONFIG, "tongclientid");
        // Where to find Kafka broker(s).
        streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        // Specify default (de)serializers for record keys and for record values.
        streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
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
