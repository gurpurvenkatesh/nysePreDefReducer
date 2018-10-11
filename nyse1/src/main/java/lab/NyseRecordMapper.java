package lab;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class NyseRecordMapper extends Mapper<LongWritable, Text, Text, LongWritable>{
	
	public void map(LongWritable lineOffset, Text record, Context output) throws IOException, InterruptedException{
		output.write(new Text("Count"), new LongWritable(1));
	}
}