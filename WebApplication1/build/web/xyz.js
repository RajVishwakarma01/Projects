function uname()
{
    x=document.getElementById('t1').value;
    y=x.length;
    if(y<3)
    {
        document.getElementById('s1').innerHTML="invalid user name";
        
        return false;
        
    }
    else
    {
        return true;
    }
    
}
function upass()
{
    x=document.getElementById('t2').value;
    y=x.length;
    if(y<3)
    {
        document.getElementById('s2').innerHTML="invalid user Pass";
        
        return false;
        
    }
    else
    {
        return true;
    }
    
}



function demo()
{
    document.getElementById('s1').innerHTML="";
    document.getElementById('s2').innerHTML="";
    
    if(uname() && upass())
    {
        form1.submit();
        
    }
   
}