package com.goda5.hagendaz.data;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.SequenceFileInputFormat;
import org.apache.hadoop.mapred.SequenceFileOutputFormat;
import org.testng.annotations.Test;

@Test
public class MyHadoop {
	public void testStart() throws IOException {
		JobConf job = new JobConf(new Configuration(), Job.class);
		job.setJobName("myjob");

		FileInputFormat.setInputPaths(job, new Path("in"));
		FileOutputFormat.setOutputPath(job, new Path("out"));

		job.setMapperClass(Job.MyMapper.class);
		job.setCombinerClass(Job.MyReducer.class);
		job.setReducerClass(Job.MyReducer.class);

		job.setInputFormat(SequenceFileInputFormat.class);
		job.setOutputFormat(SequenceFileOutputFormat.class);
		
		JobClient.runJob(job);
	}

	class Job {
		class MyMapper implements Mapper<Integer, String, Integer, String> {

			@Override
			public void configure(JobConf arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void map(Integer arg0, String arg1,
					OutputCollector<Integer, String> arg2, Reporter arg3)
					throws IOException {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		class MyReducer implements Reducer<Integer, String, Integer, String> {

			@Override
			public void configure(JobConf arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void reduce(Integer arg0, Iterator<String> arg1,
					OutputCollector<Integer, String> arg2, Reporter arg3)
					throws IOException {
				// TODO Auto-generated method stub
				
			}
			
		}
	}
}
