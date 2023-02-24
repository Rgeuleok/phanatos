package com.pavel.phanatos;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.pavel.phanatos.fragment.AlgebraFragment;
import com.pavel.phanatos.fragment.GeometryFragment;
import com.pavel.phanatos.fragment.HomeFragment;

public class MainViewPagerAdapter extends FragmentStateAdapter {

    public MainViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new AlgebraFragment();
            case 2:
                return new GeometryFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
