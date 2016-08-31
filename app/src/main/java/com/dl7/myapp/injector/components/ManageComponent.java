package com.dl7.myapp.injector.components;

import com.dl7.myapp.injector.modules.ManageModule;
import com.dl7.myapp.module.manage.ManageActivity;

import dagger.Component;

/**
 * Created by long on 2016/8/31.
 * 管理 Component
 */
@Component(modules = ManageModule.class)
public interface ManageComponent {
    void inject(ManageActivity activity);
}
