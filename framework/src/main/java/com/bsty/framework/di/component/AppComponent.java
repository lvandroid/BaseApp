//package com.bsty.framework.di.component;
//
//import android.app.Application;
//
//import com.bsty.framework.CoreApp;
//import com.bsty.framework.di.builder.ActivityBuilder;
//import com.bsty.framework.di.module.AppModule;
//
//import javax.inject.Singleton;
//
//import dagger.Component;
//import dagger.android.AndroidInjectionModule;
//
//@Singleton
//@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
//public interface AppComponent {
//    void inject(CoreApp app);
//
//    @Component.Builder
//    interface Builder {
//        Builder application(Application application);
//
//        AppComponent build();
//    }
//}
