function uppercase(str)
{
  var array1 = str.split(' ');
  var array2 = [];
    
  for(var x = 0; x < array1.length; x++){
      array2.push(array1[x].charAt(0).toUpperCase()+array1[x].slice(1));
      array2.push(" ");

  }
  var res="";
  for(var y=0;y<array2.length;y++)
  {
     res+=array2[y];
  }
  console.log(res);
}
console.log(uppercase("lets make india great"));