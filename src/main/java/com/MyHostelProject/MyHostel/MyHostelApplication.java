package com.MyHostelProject.MyHostel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class MyHostelApplication {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		SpringApplication.run(MyHostelApplication.class, args);

//		List<Integer> arr = Arrays.asList(60,60,56,45,56,60,45,34,40,10,20,34,56,34,45);
//		int z = 0,y = 0;
//		for (int i:arr) {
//			int x = i;
//			int c = 0;
//			for (int j: arr)
//				  {
//					  if(x == j){
//						  c++;
//
//					  if(c>y){
//						 z = x;
//						 y = c;
//					  }
//					  }
//
//			}
//
//		}
//		System.out.println(z);
//		List temp = arr.stream().filter(x-> x % 5 == 0).collect(Collectors.toList());
//		System.out.println(temp);
//
//		arr.stream().filter(x-> x % 10 == 0)
//				.map(x-> x*x).forEach(x-> System.out.println(x));

//		Scanner s = new Scanner(System.in);
//		System.out.println("enter number");
//		int t= s.nextInt();
//		List temp = new ArrayList();
//
//
//		for(int k = 0; k<t; k++){
//
//			int n = s.nextInt();
//			int m = s.nextInt();
//
//			char[][] table = new char[n][m];
//
//			for(int i =0; i<n; i++){
//				for(int j = 0; j<m; j++){
//					table[i][j] = s.next().charAt(0);
//				}
//			}
//
//			int max = 0;
//
//			for(int i=0; i<n; i++){
//				for(int j=0; j<m; j++){
//					int count = 0;
//					if(table[i][j] == '#'){
//						for(int b= j; b<m; b++){
//							if(table[i][b] == '.'){
//								break;
//							}
//							count++;
//						}
//						if(max<=count)
//							max = count;
//						break;
//					}
//
//				}
//			}
//			//System.out.println(max);
//			temp.add(max);
//			n=0;
//			m=0;
//		}
//		temp.forEach(x-> System.out.println(x));
//
	}

}
