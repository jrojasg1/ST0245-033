public boolean tripleUp(int[] array) {
  int cont = 0;
  if(array.length == 0)return false;
  else{
    for(int pos=0;pos <= array.length-1;pos++){
      int aux = pos+1;
      if( aux <= array.length-1 && aux+1 <= array.length-1 && 
        array[pos]+1==array[aux] && array[aux]+1==array[aux+1]){
        cont += 1;
      }else{
        cont +=0;
      }
    }
  }
  if(cont > 0)return true;
  return false;
}