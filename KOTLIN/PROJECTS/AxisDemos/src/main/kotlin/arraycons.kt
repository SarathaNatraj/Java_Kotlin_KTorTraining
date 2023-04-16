fun main()
{
    val arrayname = Array(5, { i -> i * 1 })
    for (i in 0..arrayname.size-1)
    {
        println(arrayname[i])
    }
}