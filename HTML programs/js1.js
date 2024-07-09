function myfun(){
    var age= prompt("hellow this is prompt enter anything")
    if(age>=18){
    document.write("eligible")
}
    else{
        document.write("not eligible")
    }
}
function showimg(){
    document.write("<img src='img6.jpg'>")
}

function table(){
    document.write("START");
    document.write("<table border='2'>")
    for(i=1;i<=10;i++)
    {
        document.write("<tr>")
        for(j=1;j<=10;j++)
        {
        document.write("<td>");
        document.write(i*j);
        document.write("</td>");

        }
        document.write("</tr>")
    }

    document.write("</table>")
}

function pattern(){

    for(i=1;i<=10;i++){
        for(j=1;j<i;j++){
            document.write("*")
        }
      document.write("<br>")
    }
}

function  pyramid(){
    var row=10
    for(i=1;i<=row;i++)
        {

            for(j=1;j<row-i;j++){
                document.write("&#160");
            }
            
            for(k=1;k<=(2*i-1);k++)
            {
                document.write("*");
            }
            document.write("<br>");

        }

}

function square(num){
    var sq=num*num;
    return sq;
}

