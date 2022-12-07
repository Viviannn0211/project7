public class project7 {
    void prims(int [][]Matiix,int start){
        int lenght = Matiix.length;
        boolean [] visited = new boolean[lenght];
        int [] parents = new int[lenght];
        for(int i=0;i < lenght;i++)
            visited[i]=false;

        visited[start]=true;
        parents[start]=0;

        for(int x=0; x<lenght; x++) {
            int mini = Integer.MAX_VALUE;
            int mini_index = 0;
            int mini_parents = 0;
            for(int y=0; y<lenght; y++){
                for(int n=0; n<lenght; n++){
                    if (Matiix[y][n]!= 0 && !visited[n] && visited[y] && Matiix[y][n]<mini) {
                        mini = Matiix[y][n];
                        mini_index = n;
                        mini_parents = y;
                    }
                }
            }
            visited[mini_index] = true;
            parents[mini_index] = mini_parents; //index是room number, parents是array裡的values
        }

        System.out.println("Edge \tWeight");
        for(int i=0; i<lenght; i++){
            System.out.println(parents[i]+" - "+i+" = "+Matiix[parents[i]][i]);
        }
    }

    public static void main(String[] args) {
        int [][] Matrix = {
                {0,4,0,0,0,0,0,8,0},
                {4,0,8,0,0,0,0,11,0},
                {0,8,0,7,0,4,0,0,2},
                {0,0,7,0,9,14,0,0,0},
                {0,0,0,9,0,10,0,0,0},
                {0,0,4,14,10,0,2,0,0},
                {0,0,0,0,0,2,0,1,6},
                {8,11,0,0,0,0,1,0,7},
                {0,0,2,0,0,0,6,7,0}
        };
        project7 prim = new project7();
        prim.prims(Matrix,0);
    }


}
