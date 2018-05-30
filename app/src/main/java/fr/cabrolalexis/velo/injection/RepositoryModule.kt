package fr.cabrolalexis.velo.injection

import fr.cabrolalexis.velo.data.VLService
import fr.cabrolalexis.velo.repository.CityRepository
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton


val repositoryModule = Kodein.Module {
    bind<CityRepository>() with singleton { CityRepository(instance<VLService>()) }
}