//no of substring in a string
function occur(string, substr)
{
    var count=0;
    for(var i=0;i<string.length;i++)
    {
        var substr1="";
        for(var j=i;j<string.length;j++)
        {
            substr1+=string.charAt(j);
            if(substr==substr1)
            {
                count++;
            }
             
        }
    }
    console.log(count);
}
occur("trichochosachoch","ch");