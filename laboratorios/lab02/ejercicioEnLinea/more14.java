public boolean more14(int[] array) {
  int uno=0;
  int cuatro=0;
  if(array.length == 0)return false;
  else{
    for(int i=0;i <= array.length-1;i++){
      if(array[i] == 1){
        uno += 1;
      }else{
        if(array[i] == 4){
        cuatro += 1;
      }
      }
    }
  }
  if(uno > cuatro)return true;
  return false;
}