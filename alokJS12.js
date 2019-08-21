var currentdate = new Date();
var weekdays = new Array(7);
        weekdays[0] = "Sunday";
        weekdays[1] = "Monday";
        weekdays[2] = "Tuesday";
        weekdays[3] = "Wednesday";
        weekdays[4] = "Thursday";
        weekdays[5] = "Friday";
        weekdays[6] = "Saturday";
console.log("Today:"+weekdays[currentdate.getDay()]);
var x=currentdate.getHours();
var ampm;
if(x>=12)
{
ampm='PM';

}
else
{
    ampm='AM';
}
console.log("Time is:"+currentdate.getHours()+":"+currentdate.getMinutes()+":"+currentdate.getSeconds()+":"+ampm);
