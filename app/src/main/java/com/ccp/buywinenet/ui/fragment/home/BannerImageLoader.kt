package com.ccp.buywinenet.ui.fragment.home

import android.content.Context
import android.widget.ImageView
import com.ccp.buywinenet.R
import com.ccp.buywinenet.model.bean.Data
import com.ccp.buywinenet.utils.ImageOptions
import com.ccp.buywinenet.utils.loadImage
import com.youth.banner.loader.ImageLoader

/**
 *作者：刘小芳2020-05-12 15:36
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
class BannerImageLoader : ImageLoader() {
    override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
//        if( (path as? Data)?.adv_BlockID == 1){
            val imagePath = (path as? Data)?.Pic
            imageView?.loadImage(imagePath, ImageOptions().apply {
                placeholder = R.mipmap.default_jgw2
            })
//        }
    }

}