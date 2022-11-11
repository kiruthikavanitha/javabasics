package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		StudImp studImp=new StudImp(1,"kiruthi",18,92);
		StudImp studImp1=new StudImp(3,"nidhi",19,95);
		StudImp studImp2=new StudImp(2,"vadivu",17,90);
		
		ArrayList<StudImp> arrayList=new ArrayList<StudImp>();
		arrayList.add(studImp);
		arrayList.add(studImp1);
		arrayList.add(studImp2);
		
		String b="yes";
		String b1="yes";
		while(b.equals(b1))
		{
			System.out.println("choose the fields which u want to display \n1.studentid\n2.studentname\n3.studentage\n4.studentmarks");
			Scanner  scanner=new  Scanner(System.in);
			int a=scanner.nextInt();
			switch(a) {
			case 1:
				Collections.sort(arrayList,new CompareBySid());
				for(StudImp studImp3:arrayList) {
					System.out.println(studImp3);
				}
				break;
			case 2:
				Collections.sort(arrayList,new CompareBySname());
				for(StudImp studImp3:arrayList) {
					System.out.println(studImp3);
				}
				break;
			case 3:
				Collections.sort(arrayList,new CompareBySage());
				for(StudImp studImp3:arrayList) {
					System.out.println(studImp3);
				}
				break;
			case 4:
				Collections.sort(arrayList,new CompareBySmarks());
				for(StudImp studImp3:arrayList) {
					System.out.println(studImp3);
				}
				break;
			}
			System.out.println("Do u want to continue");
			String c=scanner.next();
			b1=c;
		}
		System.out.println("THANK YOU");
	}

}
