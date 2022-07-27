package vescame.cleanarchitecture.common

interface CommonAdapter<in T, out O> {

    fun toAdapted(input: T): O
}
