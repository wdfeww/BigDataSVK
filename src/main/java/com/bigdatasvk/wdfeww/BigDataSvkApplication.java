package com.bigdatasvk.wdfeww;

import com.bigdatasvk.wdfeww.mappers.MarketCountMapper;
import com.bigdatasvk.wdfeww.reducers.MarketCountReducer;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class BigDataSvkApplication {


    public static void main(String[] args) throws Exception {

        String inputPath = "/hadoopData/Data.csv";
        String outputPath = "/hadoopProcessedData";

        Job job = new Job();
        job.setJarByClass(BigDataSvkApplication.class);
        job.setJobName("MarketCount");

        FileInputFormat.addInputPath(job, new Path(inputPath));
        FileOutputFormat.setOutputPath(job, new Path(outputPath));

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);

        job.setMapperClass(MarketCountMapper.class);
        job.setReducerClass(MarketCountReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        System.exit(job.waitForCompletion(true) ? 0 : 1);
        //generate file
//        new CSVFileGenerator().generateData();

    }
}
