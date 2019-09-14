class B
                  {
                  public static void main(String args[])
                  {
                	  System.out.println(Thread.currentThread());
                	  Thread.currentThread().setName("sandeep");
                	  Thread.currentThread().setPriority(1);
                	  System.out.println(Thread.currentThread());
                	  String s="welcome";
                	  String s1=new String("weccome");
                	  System.out.println(s.equals(s1));
                	  System.out.println(s==s1);
                	  System.out.println(s.compareTo(s1));
                	  System.out.println(s.codePointBefore(3));
                	  System.out.println(s.substring(1,3));
                   }
                   }

