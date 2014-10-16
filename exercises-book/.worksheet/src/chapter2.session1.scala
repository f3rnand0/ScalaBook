package chapter2

object session1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(47); 
  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(64); 
  while (i < args.length) {
    println(args(i))
    i += 1
  }}
}
