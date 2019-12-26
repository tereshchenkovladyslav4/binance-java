package com.binance.client.impl;

import com.binance.client.SyncRequestClient;
import com.binance.client.model.AccountApiTradingStatus;
import com.binance.client.model.AccountStatus;
import com.binance.client.model.AssetDetail;
import com.binance.client.model.Balance;
import com.binance.client.model.CoinInformation;
import com.binance.client.model.DepositAddress;
import com.binance.client.model.DepositAddressSapi;
import com.binance.client.model.DepositHistory;
import com.binance.client.model.DepositHistorySapi;
import com.binance.client.model.DustLog;
import com.binance.client.model.SubAccount;
import com.binance.client.model.SubAccountTransferHistory;
import com.binance.client.model.SystemStatus;
import com.binance.client.model.TradeFee;
import com.binance.client.model.TradeStatistics;
import com.binance.client.model.WithdrawHistory;
import com.binance.client.model.WithdrawHistorySapi;

import java.util.List;

public class SyncRequestImpl implements SyncRequestClient {

    private final RestApiRequestImpl requestImpl;

    SyncRequestImpl(RestApiRequestImpl requestImpl) {
        this.requestImpl = requestImpl;
    }

    @Override
    public TradeStatistics get24HTradeStatistics(String symbol) {
        return RestApiInvoker.callSync(requestImpl.get24HTradeStatistics(symbol));
    }

    @Override
    public SystemStatus getSystemStatus() {
        return RestApiInvoker.callSync(requestImpl.getSystemStatus());
    }

    @Override
    public List<CoinInformation> getAllCoinsInformation() {
        return RestApiInvoker.callSync(requestImpl.getAllCoinsInformation());
    }

    @Override
    public Long postWithdrawSapi(String coin, String address, String amount, String network, String addressTag,
            String name) {
        return RestApiInvoker.callSync(requestImpl.postWithdrawSapi(coin, address, amount, network, addressTag, name));
    }

    @Override
    public Long postWithdraw(String asset, String address, String amount, String network, String addressTag, String name) {
        return RestApiInvoker.callSync(requestImpl.postWithdraw(asset, address, amount, network, addressTag, name));
    }

    @Override
    public List<DepositHistorySapi> getDepositHistorySapi(String coin, Integer status, Long startTime, Long endTime, Integer offset) {
        return RestApiInvoker.callSync(requestImpl.getDepositHistorySapi(coin, status, startTime, endTime, offset));
    }

    @Override
    public List<DepositHistory> getDepositHistory(String asset, Integer status, Long startTime, Long endTime) {
        return RestApiInvoker.callSync(requestImpl.getDepositHistory(asset, status, startTime, endTime));
    }

    @Override
    public List<WithdrawHistorySapi> getWithdrawHistorySapi(String coin, Integer status, Integer offset, 
            Integer limit, Long startTime, Long endTime) {
        return RestApiInvoker.callSync(requestImpl.getWithdrawHistorySapi(coin, status, offset, limit, startTime, endTime));
    }

    @Override
    public List<WithdrawHistory> getWithdrawHistory(String asset, Integer status, Long startTime, Long endTime) {
        return RestApiInvoker.callSync(requestImpl.getWithdrawHistory(asset, status, startTime, endTime));
    }

    @Override
    public DepositAddressSapi getDepositAddressSapi(String coin, String network) {
        return RestApiInvoker.callSync(requestImpl.getDepositAddressSapi(coin, network));
    }

    @Override
    public DepositAddress getDepositAddress(String asset, String status) {
        return RestApiInvoker.callSync(requestImpl.getDepositAddress(asset, status));
    }

    @Override
    public AccountStatus getAccountStatus() {
        return RestApiInvoker.callSync(requestImpl.getAccountStatus());
    }

    @Override
    public AccountApiTradingStatus getAccountApiTradingStatus() {
        return RestApiInvoker.callSync(requestImpl.getAccountApiTradingStatus());
    }

    @Override
    public List<DustLog> getDustLog() {
        return RestApiInvoker.callSync(requestImpl.getDustLog());
    }

    @Override
    public List<TradeFee> getTradeFee(String symbol) {
        return RestApiInvoker.callSync(requestImpl.getTradeFee(symbol));
    }

    @Override
    public List<AssetDetail> getAssetDetail() {
        return RestApiInvoker.callSync(requestImpl.getAssetDetail());
    }

    @Override
    public List<SubAccount> getSubAccounts(String email, String status, Integer page, Integer limit) {
        return RestApiInvoker.callSync(requestImpl.getSubAccounts(email, status, page, limit));
    }

    @Override
    public List<SubAccountTransferHistory> getSubAccountTransferHistory(String email, Long startTime, Long endTime,
            Integer page, Integer limit) {
        return RestApiInvoker.callSync(requestImpl.getSubAccountTransferHistory(email, startTime, endTime, page, limit));
    }

    @Override
    public Long postSubAccountTransfer(String fromEmail, String toEmail, String asset, String amount) {
        return RestApiInvoker.callSync(requestImpl.postSubAccountTransfer(fromEmail, toEmail, asset, amount));
    }

    @Override
    public List<Balance> getSubAccountAssets(String email, String symbol) {
        return RestApiInvoker.callSync(requestImpl.getSubAccountAssets(email, symbol));
    }

    @Override
    public DepositAddressSapi getSubAccountDepositAddress(String email, String coin, String network) {
        return RestApiInvoker.callSync(requestImpl.getSubAccountDepositAddress(email, coin, network));
    }

}
