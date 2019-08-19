function checkIndex(string,index){
    var c=string.charAt(index-1);
    if(c==c.toUpperCase())
    {
        console.log("Upper Case");
    }
    else
    {
        console.log("Lowercase");
    }

}
checkIndex('aLok',3);