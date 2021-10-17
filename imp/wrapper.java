class cmd
{ public static void main(String[] args)
{ int s=0;
  for(int i=0;i<args.length;i++)
s=s+Integer.parseInt(args[i]);  //using wrapper class
    System.out.println(s);
}
}