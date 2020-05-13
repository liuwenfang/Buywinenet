package com.ccp.buywinenet.ui.fragment.home

import com.ccp.buywinenet.R
import com.ccp.buywinenet.model.bean.Data
import com.ccp.buywinenet.utils.ImageOptions
import com.ccp.buywinenet.utils.loadImage
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import kotlinx.android.synthetic.main.item_nav_list.view.*

/**
 *作者：刘小芳2020-05-13 08:56
 *邮箱：ccpchick@163.com
 *desc：蜡笔小新的烦恼
 */
class ItemNavAdapter(layoutResId: Int = R.layout.item_nav_list) :
    BaseQuickAdapter<Data, BaseViewHolder>(layoutResId) {
    override fun convert(holder: BaseViewHolder, item: Data) {
        if (item.adv_BlockID == 3) {
            holder.itemView.iv_pic.loadImage(item.Pic, ImageOptions().apply {
                placeholder = R.mipmap.default_bg
            })
            holder.itemView.tv_title.text = item.Name
        }

    }

}