package com.example.geeknews.mdolue;

import com.example.geeknews.api.ZhihuApi;
import com.example.geeknews.beas.moudle.HttpFinishCallback;
import com.example.geeknews.http.BaseObserver;
import com.example.geeknews.http.zhihu.ZhihuManager;
import com.example.geeknews.utils.RxUtils;

/**
 * Created by 马明祥 on 2018/12/24.
 */

public class ZhihuModlue {

    public interface ZhihuCallback<T> extends HttpFinishCallback{

        void setZhihu(T t, ZhihuApi zhihuApi);

    }

    public void getZhihu(String data,int id,final ZhihuCallback zhihuCallback, final ZhihuApi zhihuApi){
        zhihuCallback.setShowProgressbar();
        switch (zhihuApi) {
            case ZUIXINRIBAO:
                ZhihuManager.getZhihuManager().getDailyList().compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case ZHUANLANRIBAO:
                ZhihuManager.getZhihuManager().getSectionList().compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case REMENRIBAO:
                ZhihuManager.getZhihuManager().getHotList().compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case RIBAOXIANGQING:
                ZhihuManager.getZhihuManager().getDetailInfo(id).compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case ZHUANLANRIBAOXIANGQING:
                ZhihuManager.getZhihuManager().getSectionChildList(id).compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case EWAIXINXI:
                ZhihuManager.getZhihuManager().getDetailExtraInfo(id).compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case CHANGPING:
                ZhihuManager.getZhihuManager().getLongCommentInfo(id).compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case DUANPING:
                ZhihuManager.getZhihuManager().getShortCommentInfo(id).compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
            case WANGQIRIBAO:
                ZhihuManager.getZhihuManager().getDailyBeforeList(data).compose(RxUtils.<String>rxObserableSchedulerHelper()).subscribe(new BaseObserver<String>(zhihuCallback) {
                    @Override
                    public void onNext(String value) {
                        zhihuCallback.setZhihu(value,zhihuApi);
                    }
                });
                break;
        }
    }
}
