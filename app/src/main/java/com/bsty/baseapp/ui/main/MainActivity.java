package com.bsty.baseapp.ui.main;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.bsty.baseapp.BR;
import com.bsty.baseapp.R;
import com.bsty.baseapp.ViewModelProviderFactory;
import com.bsty.baseapp.databinding.MainActivityBinding;
import com.bsty.framework.base.BaseActivity;

import javax.inject.Inject;


public class MainActivity extends BaseActivity<MainActivityBinding, MainViewModel> implements MainNavigator {
    @Inject
    ViewModelProviderFactory factory;
    private MainViewModel viewModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.main_activity;
    }

    @Override
    public MainViewModel getViewModel() {
        viewModel = ViewModelProviders.of(this, factory).get(MainViewModel.class);
        return viewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
