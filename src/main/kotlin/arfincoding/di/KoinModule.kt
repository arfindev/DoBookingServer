package arfincoding.di

import arfincoding.repository.HotelRepository
import arfincoding.repository.HotelRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HotelRepository> {
        HotelRepositoryImpl()
    }

}