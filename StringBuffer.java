class StringBuffer 
{
    public static void main(String[] args) 
{
   StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity()); // Default capacity is 16
    sb.append("Hello");
    System.out.println(sb.capacity());
    sb.append("java is my favourite language");
    System.out.println(sb.capacity()); // Increases to 34
    }
}
