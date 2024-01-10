import java.io.*;
class TransposeMatrix
{
public static void main(String args[])throws IOException
{
int a[][]=new int[3][3];
DataInputStream dis=new DataInputStream(System.in);
System.out.println("enter the values");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(dis.readLine());
}
System.out.println();
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
System.out.println("transpose matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[j][i]+"\t");
}
System.out.println();
}
}
}
