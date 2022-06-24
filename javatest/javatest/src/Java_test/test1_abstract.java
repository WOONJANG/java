package Java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class test1_abstract {
	String arr [] = {"국어", "영어", "수학", "과학", "사회"};

	ArrayList<String> em = new ArrayList<>();
	abstract public void setter();
	abstract public String getter();
	abstract public void db();
}