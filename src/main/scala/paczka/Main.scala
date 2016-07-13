package paczka

object Main{

	def main(args: Array[String]){
		val result=Calc.add(13,5)
		println(s"result=$result")
	}

	class JugMeeting(topic:String,participants:Int)

}

object Calc{
	def add(i1:Int,i2:Int) = i1+i2
	def sub(i1:Int,i2:Int) = i1-i2
}