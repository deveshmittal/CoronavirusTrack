package app.workchat.traceindia.android.di.component

import app.workchat.traceindia.android.MainApplication
import app.workchat.traceindia.android.di.AndroidSupportInjectionModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjection
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<MainApplication>{
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance mainApplication: MainApplication): AppComponent
    }
}