package com.wafermessenger.restcountries;

/**
 * Created by Edivaldo Jr. on 16/08/18.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wafermessenger.restcountries.models.Country;
import com.wafermessenger.restcountries.models.Currency;
import com.wafermessenger.restcountries.models.Language;

import java.util.List;


public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.MyViewHolder> {
    private Context context;
    private List<Country> cartList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, currency, language;
        public RelativeLayout viewBackground, viewForeground;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            currency = view.findViewById(R.id.currency);
            language = view.findViewById(R.id.language);
            viewBackground = view.findViewById(R.id.view_background);
            viewForeground = view.findViewById(R.id.view_foreground);
        }
    }

    public CountryListAdapter(Context context, List<Country> cartList) {
        this.context = context;
        this.cartList = cartList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cart_list_country , parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Country country = cartList.get(position);
        holder.name.setText(country.getName());
        holder.currency.setText(preventNullCurrencyName(country.getCurrencies()));
        holder.language.setText(preventNullLanguageName(country.getLanguages()));
    }

    private String preventNullCurrencyName(List<Currency> currencyList) {
        if (currencyList.isEmpty()) {
            return "";
        } else {
            return (null == currencyList.get(0).getName() ? "" : currencyList.get(0).getName());
        }
    }

    private String preventNullLanguageName(List<Language> languageList) {
        if (languageList.isEmpty()) {
            return "";
        } else {
            return (null == languageList.get(0).getName() ? "" : languageList.get(0).getName());
        }
    }

    @Override
    public int getItemCount() {

        return (null != cartList ? cartList.size() : 0);
    }

    public void removeItem(int position) {
        cartList.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreItem(Country country, int position) {
        cartList.add(position, country);
        notifyItemInserted(position);
    }
}
