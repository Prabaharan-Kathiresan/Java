import java.io.*;
class MatrixEquality
{
public static void main(String args[])throws IOException
{
boolean doo=false;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
//String c;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("enter the values");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(dis.readLine());
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
b[i][j]=Integer.parseInt(dis.readLine());
}
}
System.out.println("print the matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("print the matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(a[i][j]==b[i][j])
{
doo=true;
break;
}
}
}
if(doo)
{
System.out.println("matri");
}
else
System.out.println("not");
}
}


