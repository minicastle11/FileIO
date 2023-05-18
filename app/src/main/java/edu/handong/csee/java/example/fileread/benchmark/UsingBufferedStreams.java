package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedStreams {
    public static void main(String[] args) throws IOException {

            //-------------- Test reading 1 MB file. --------------------
        StopWatch.start();
        String fileName = args[0];

        BufferedInputStream inputStream= new BufferedInputStream(new FileInputStream(new File(fileName)));
        while (inputStream.read()!=-1){}

        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");
        
        inputStream.close();

        //-------------- Test reading 10 MB file. --------------------
        StopWatch.start();
        String fileName2 =  args[1];
        BufferedInputStream inputStream2= new BufferedInputStream(new FileInputStream(new File(fileName2)));
        while (inputStream2.read()!=-1){}

        long duration2 = StopWatch.stop();
        System.out.println(duration2 + " milsec");
        
        inputStream2.close();

        /*
        //-------------- Test reading 100 MB file. --------------------
        StopWatch.start();

        BufferedInputStream inputStream3= new BufferedInputStream(new FileInputStream(new File(DumpDataWriter.input100MB)));
        while (inputStream3.read()!=-1){}

        long duration3 = StopWatch.stop();
        System.out.println(duration3 + " milsec");
        
        inputStream3.close();

        //-------------- Test reading 1000 MB file. --------------------
        StopWatch.start();

        BufferedInputStream inputStream4= new BufferedInputStream(new FileInputStream(new File(DumpDataWriter.input1000MB)));
        while (inputStream4.read()!=-1){}
        long duration4 = StopWatch.stop();
        System.out.println(duration4 + " milsec");
        
        inputStream4.close();
        */
    }
}
