
package com.mp.android.apps.monke.monkeybook.presenter;

import com.mp.android.apps.monke.basemvplib.IPresenter;
import com.mp.android.apps.monke.monkeybook.bean.BookShelfBean;
import com.mp.android.apps.monke.monkeybook.bean.SearchBookBean;

public interface IBookDetailPresenter extends IPresenter {

    int getOpenfrom();

    SearchBookBean getSearchBook();

    BookShelfBean getBookShelf();

    Boolean getInBookShelf();

    void getBookShelfInfo();

    void addToBookShelf();

    void removeFromBookShelf();
}
