package com.example.reg;

import com.example.coreui.BasePresentationFragment;
import com.example.coreui.di.AndroidInjector;
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class RegJavaFragment extends BasePresentationFragment<RegJavaPresenter> {

    private RegJavaPresenter mPresenter;

    @NotNull
    @Override
    public RegJavaPresenter getPresenter() {
        return mPresenter;
    }

    @Override
    @Inject
    public void setPresenter(@NotNull RegJavaPresenter regJavaPresenter) {
        this.mPresenter = regJavaPresenter;
    }

    @Override
    public void inject() {
        AndroidInjector
                .component(this, RegistrationComponent.class)
                .inject(this);
    }
}
