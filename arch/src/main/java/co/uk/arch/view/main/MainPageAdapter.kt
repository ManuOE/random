package co.uk.arch.view.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import co.uk.arch.view.channel.ChannelFragment
import co.uk.arch.view.playlist.PLaylistFragment
import co.uk.arch.view.video.VideoFragment

class MainPageAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    private val titles = arrayOf("CHANNEL", "PLAYLIST", "VIDEOS")


    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> ChannelFragment.newInstance()
                1 -> PLaylistFragment.newInstance()
                2 -> VideoFragment.newInstance()
                else -> ChannelFragment.newInstance()
            }

    override fun getPageTitle(position: Int): CharSequence = titles[position]

    override fun getCount(): Int = titles.size
}