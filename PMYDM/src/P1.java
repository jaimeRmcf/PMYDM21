public class P1 {
        public static  void main(String[] args) {
            String sNombre = "alb erto fernan dez san chez";
            String arraySeccion [] = sNombre.split(" ");
            for (int i=0; i < arraySeccion.length ; i++);
            {
                if(arraySeccion[i].length() %2 != 0)
                {
                    System.out.println(arraySeccion[i]);
                }
            }


        }
}
