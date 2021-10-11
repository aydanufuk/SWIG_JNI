
#pragma once
#include<iostream>
#include<conio.h>
#include<stdlib.h>
#include<stdio.h>

struct addr
{
	int houseno;
	char street[30];
	char city[20];
	char state[20];
};

struct emp
{
	int empno;
	char name[20];
	char desig[20];
	addr address;
	float basic;
}worker;
