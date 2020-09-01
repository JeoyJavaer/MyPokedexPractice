package master.kotlin.pokedexapp.base

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created on 2020/9/1.
 * Description
 * Others
 */
abstract class DataBindingActivity :AppCompatActivity(){
    protected  inline  fun <reified  T :ViewDataBinding>binding(@LayoutRes resId:Int):Lazy<T> = lazy { DataBindingUtil.setContentView<T>(this,resId) }
}