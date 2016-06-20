class Main {
  public static void main(String[] args) {
    System.out.println("100 Doors");
    
    boolean[] doors=new boolean[100];
		for(int i=0;i<10;i++)
			doors[i*(i+2)]=true;
		for(int i=0;i<100;i++)
			System.out.println("Door #"+(i+1)+" is"+(doors[i]?" open.":" closed."));
    
  }
}