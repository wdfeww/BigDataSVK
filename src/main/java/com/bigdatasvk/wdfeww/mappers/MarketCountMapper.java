package com.bigdatasvk.wdfeww.mappers;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MarketCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] items = line.split(",");
        //ktory item v poradi chcem mapovat
        String marketName = items[1];
        context.write(new Text(marketName), new IntWritable(1));
    }
}
