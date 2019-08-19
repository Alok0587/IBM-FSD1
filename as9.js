//to merge two arrays and remove duplicates
function merge()
{
    
    var arr2=[12,13,15,16,17,18,19,20];
    var arr1=[34,35,36,37,38,19,20,15];
    var set1=new Set();
    for(var i=0;i<arr2.length;i++)
    {
        set1.add(arr2[i]);
    }
    for(var j=0;j<arr1.length;j++)
    {
        set1.add(arr[j]);
    }

        console.log(set1);
}
merge()