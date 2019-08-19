function lws(string)
{
    arr1=string.split(' '); 
    var maxl=0;
    var mwrd;
    for(var i=0;i<arr1.length;i++)
    {
        var clen=arr1[i].length;
        if(maxl<clen)
        {
            maxl=clen;
            mwrd=arr1[i];
        }
    }
    console.log("longest string is- "+mwrd+"- of length "+maxl);

}
lws("i am just anything");