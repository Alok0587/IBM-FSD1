//test whether to string starts with specified string
function check(strings,spec)
{
    var len=spec.length;
    var lenstr=strings.length;
    var str="";
    for(var i=0;i<len;i++)
    {
       str+=strings.charAt(i);
    }
    if(str.charAt(len-1)==" "||spec.charAt(len-1)==" ")
    {
    if(str==spec)
    {
        console.log("YES");
    }
    else
    {
        console.log("NO");
    }
    }
    else
    {
        console.log("NO")
    }
    
    
}check("my name is lakhan","my name ");