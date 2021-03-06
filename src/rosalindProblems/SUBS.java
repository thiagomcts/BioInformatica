/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosalindProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import rosalindProblems.Reader.ADNFastaReader;
import rosalindProblems.Reader.DNAReader;
import rosalindProblems.Reader.FastaReader;
import rosalindProblems.Reader.RawDNAReader;

public class SUBS extends GenericProblem{
    

    

    @Override
    public String Solve(ADNFastaReader Origin) {
        List<String> ls=Origin.ReadAllLines();
        String s=ls.get(0);
        String t=ls.get(1);
        
        String result="";
        int k=0;
        int v=t.length();
        int j=v;
        while(j<s.length()) {
            String sub= s.substring(k, j);
            //System.out.println(sub);
            if (sub.equalsIgnoreCase(t)) 
                result=result+" "+(k+1);
            
            k++;
            j=k+v;
            
        }
        return (result);
    }

    @Override
    public ADNFastaReader getFastaReader(FileReader in) {
        ADNFastaReader reader= new FastaReader();
        reader.Init(in);
        return reader;
    }
    
    
}
