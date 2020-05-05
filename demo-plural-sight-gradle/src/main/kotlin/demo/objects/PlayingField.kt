package demo.objects

class PlayingField{

    companion object Size{
        var width = 0
        var height = 0

        fun changeSize(width: Int, height: Int){
            if(width < 0) this.width = 0 else this.width = width
            if(height < 0) this.height = 0 else this.height = height
        }

    }
}